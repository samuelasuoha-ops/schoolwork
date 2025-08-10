@echo off 
REM Name : Samuel Asuoha
REM Student ID: C00305107

REM Appending script start message to backup.log
REM This section adds a message to the backup.log file indicating
REM that the script has started and logs the current working directory.
REM It provides a starting point for tracking the execution of the script 
REM and helps in debugging if any issues arise during execution.
echo %date% %time% Script started. >> backup.log
echo %date% %time% working dir %cd% >> backup.log

REM Generating YYYYMMDD folder name
REM This section generates a folder name based on the current date in the format YYYYMMDD.
REM It ensures that the backup folder is named with the current date,
REM allowing for easy identification and organization of backup snapshots.
set "timestamp=%date:~6,4%%date:~3,2%%date:~0,2%"
set "backup_folder=%cd%\%timestamp%"

REM Checking if the backup folder already exists
REM This section checks if the backup folder for the current date already exists
REM to prevent the script from creating duplicate backup folders for the same date, 
REM ensuring that each backup snapshot is stored in a unique folder.
if not exist "%backup_folder%" (
    REM If not, create the folder and log it
    mkdir "%backup_folder%"
    echo %date% %time% created folder %timestamp% >> backup.log
) else (
    REM If the folder exists, log it
    echo %date% %time% using previously created folder %timestamp% >> backup.log
)

REM Copying the files from input folder to backup folder
REM This section copies files from the input folder to the backup folder 
REM if they are not already present to prevent data loss. 
for %%I in ("%cd%\input\*") do (
    if not exist "%backup_folder%\%%~nxI" (
        REM If file does not exist in backup folder, copy it and log
        copy "%%I" "%backup_folder%"
        echo 1 %date% %time% Added file %%~nxI to folder %timestamp% >> backup.log
    ) else (
        REM If file exists, compare them
        REM This section compares files in the input 
        REM folder with those in the backup folder and handles any differences.
        REM This ensures that only files that have changed since the last backup 
        REM are updated in the backup folder, minimizing redundancy and optimizing storage space.
        fc "%%I" "%backup_folder%\%%~nxI" > nul
        if errorlevel 1 (
            REM If files are different, overwrite and log
            copy /Y "%%I" "%backup_folder%"
            echo %date% %time% %%~nxI changed... overwritten in %timestamp% >> backup.log
        ) else (
            REM If files are same, log
            echo %date% %time% %%~nxI ignored (already in %timestamp%) >> backup.log
        )
    )
)

REM This is for the End of job message
echo %date% %time% End of Job. >> backup.log
