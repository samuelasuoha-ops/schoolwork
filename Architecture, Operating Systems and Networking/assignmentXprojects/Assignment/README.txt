Name: Samuel Asuoha
Student Number: C00305107

Instructions for running backup.bat:
1. Ensure that you have placed at least four files inside the "input" folder located in the "assignment" directory.
2. Double-click on the "backup.bat" file located in the "assignment" folder.
3. Check the "backup.log" file in the "assignment" folder for the backup process details.

Purpose of the script:
This script is designed to create a backup of files from the "input" folder to a new folder named with the current date in YYYYMMDD format. 
It logs the backup process and ensures that files are not duplicated in the backup folder.

Automating script to run on PC startup:
To automate the script to run when the PC is turned on, you can create a shortcut to the "backup.bat" file and place it in the Windows Startup folder. 
To do this, follow these steps.
1. Press Win + R to open the Run dialog.
2. Type "shell:startup" and press Enter, this will open the Startup folder.
3. Right-click inside the Startup folder and select "New" and then "Shortcut".
4. Browse to the location of the "backup.bat" file, select it, and click "Next".
5. Click "Finish" to create the shortcut.
