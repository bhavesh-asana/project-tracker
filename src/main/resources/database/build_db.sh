#!/bin/bash

DB_USER="Bhavesh"
DB_NAME="project-tracker"
SQL_DIR="./schema"  # Change this to the directory containing your .sql files

echo "Executing all SQL files in $SQL_DIR..."

for file in "$SQL_DIR"/*.sql
do
    if [ -f "$file" ]; then
        echo "Running $file..."
#        PGPASSWORD="your_password" psql -U "$DB_USER" -d "$DB_NAME" -f "$file"
         psql -U "$DB_USER" -d "$DB_NAME" -f "$file"
        echo "$file executed successfully."
    fi
done

echo "All SQL scripts executed."
