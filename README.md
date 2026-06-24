\# תרגיל בית 2 - בדיקות יחידה (Unit Tests) ב-Java



\## חברי הצוות

\* עידו 

\* ורוניקה

\* אוריין



\## תיאור הפרויקט

בפרויקט זה כתבנו סט של בדיקות יחידה (Unit Tests) בעזרת ספריית JUnit עבור מגוון פונקציות שירות מתמטיות ופעולות על מחרוזות. הבדיקות מכסות מקרי קצה (Edge Cases), כולל זריקת חריגות (Exceptions), קלטים ריקים וערכים שליליים. כמו כן, הפרויקט כולל תיעוד של תהליך הלמידה העצמית וכתיבת הבדיקות בעזרת כלי LLM תחת תיקיית ה-logs.



\## הוראות הרצה למשתמש

כדי להוריד את הפרויקט ולהריץ את בדיקות היחידה במחשבך, יש לבצע את השלבים הבאים לפי הסדר:



\### שלב א': שכפול הפרויקט (Clone)

פתח את הטרמינל/שורת הפקודה והורד את הפרויקט למחשבך באמצעות הפקודה:

`git clone https://github.com/Afeka-DevTools/26b-10142-unittesting-ido\_veronika\_oriyan.git`



לאחר מכן, היכנס לתיקיית הפרויקט שנוצרה:

`cd 26b-10142-unittesting-ido\_veronika\_oriyan`



\### שלב ב': הרצת הבדיקות

מכיוון שהפרויקט מבוסס על Gradle, ניתן להריץ את כל בדיקות היחידה בצורה אוטומטית בעזרת העטיפה של Gradle (Gradle Wrapper). 



הרץ את הפקודה הבאה בטרמינל (בסביבת Windows):

`gradlew test`



(במערכות Linux/Mac יש להריץ: `./gradlew test`)



בסיום ההרצה, Gradle יציג את תוצאות הבדיקות וידווח האם כל הבדיקות עברו בהצלחה (BUILD SUCCESSFUL).


# Bash Scripts Assignment

## Team Members
- Veronika Godin

## Description
This project contains five Bash scripts.

## Scripts

### 1. check_internet.sh
Checks internet connection and prints a log to the screen.

Run:
./scripts/check_internet.sh

### 2. add_prefix_txt.sh
Adds a prefix to all txt files in a specific directory.

Run:
./scripts/add_prefix_txt.sh <directory> <prefix>

Example:
./scripts/add_prefix_txt.sh test_folder new_

### 3. count_files.sh
Counts lines, words, and characters in each file in a directory.

Run:
./scripts/count_files.sh <directory>

### 4. delete_old_files.sh
Deletes files older than X days from a specific directory.

Run:
./scripts/delete_old_files.sh <directory> <days>

Example:
./scripts/delete_old_files.sh test_folder 7

### 5. disk_usage.sh
Displays disk usage for directories.

Run:
./scripts/disk_usage.sh <directory>

