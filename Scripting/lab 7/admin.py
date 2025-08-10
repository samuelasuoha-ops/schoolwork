# Name: Samuel Asuoha
# Student NO.: c00305107
import os
import shutil
import zipfile
import psutil
import platform
from datetime import datetime

# This copies files with a specific extension from the source folder to the backup folder.
def copy_files_by_extension(source_folder, extension, backup_folder):
    if not os.path.exists(backup_folder):
        os.makedirs(backup_folder)
    
    log_entries = []
    for root, _, files in os.walk(source_folder):
        for file in files:
            if file.endswith(extension):
                source_path = os.path.join(root, file)
                backup_path = os.path.join(backup_folder, file)

                if not os.path.exists(backup_path):
                    shutil.copy2(source_path, backup_path)
                    log_entries.append(f"{datetime.now()} - {file} - New file copied.")
                else:
                    source_mtime = os.path.getmtime(source_path)
                    backup_mtime = os.path.getmtime(backup_path)
                    if source_mtime > backup_mtime:
                        shutil.copy2(source_path, backup_path)
                        log_entries.append(f"{datetime.now()} - {file} - Modified file copied.")
                    else:
                        log_entries.append(f"{datetime.now()} - {file} - Not copied (no changes).")
    return log_entries

# This compresses the backup folder into a zip file with a timestamped name.
def compress_backup(backup_folder):
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    zip_file = f"backup_{timestamp}.zip"
    with zipfile.ZipFile(zip_file, 'w') as zipf:
        for root, _, files in os.walk(backup_folder):
            for file in files:
                zipf.write(os.path.join(root, file), 
                           os.path.relpath(os.path.join(root, file), backup_folder))
    return zip_file

# This is to write a detailed log file in the backup folder.
def generate_log_file(backup_folder, system_stats, file_logs):
    log_file = os.path.join(backup_folder, "backup_log.txt")
    with open(log_file, "a") as log:
        log.write(f"--- Backup Script Started: {datetime.now()} ---\n")
        log.write(f"Operating System: {system_stats['os']}\n")
        log.write(f"CPU Usage: {system_stats['cpu']}%\n")
        log.write(f"Memory Usage: {system_stats['memory']}%\n")
        log.write(f"Disk Usage: Total - {system_stats['disk']['total']}GB, "
                  f"Used - {system_stats['disk']['used']}GB, "
                  f"Free - {system_stats['disk']['free']}GB\n")
        for entry in file_logs:
            log.write(entry + "\n")
        log.write(f"--- Backup Script Finished: {datetime.now()} ---\n\n")

# This collects and returns system resource statistics.
def get_system_stats():
    cpu = psutil.cpu_percent(interval=1)
    memory = psutil.virtual_memory().percent
    disk = psutil.disk_usage('/')
    system_stats = {
        "os": platform.system(),
        "cpu": cpu,
        "memory": memory,
        "disk": {
            "total": round(disk.total / (1024**3), 2),
            "used": round(disk.used / (1024**3), 2),
            "free": round(disk.free / (1024**3), 2),
        }
    }
    return system_stats

def main():
    # This inputsa arguments (source folder and file extension)
    source_folder = input("Enter the source folder path: ")
    extension = input("Enter the file extension (e.g., .txt): ")
    backup_folder = "backup"

    # This copies the file
    file_logs = copy_files_by_extension(source_folder, extension, backup_folder)
    
    # This would compress the backup folder
    zip_file = compress_backup(backup_folder)
    print(f"Backup compressed into: {zip_file}")

    # This generates system stats and log file
    system_stats = get_system_stats()
    generate_log_file(backup_folder, system_stats, file_logs)
    print("Backup log created.")

if __name__ == "__main__":
    main()




"""
error log:
1. error: ModuleNotFoundError: No module named 'psutil'
    fix: I installed psutil with command: pip install psutil.
"""
