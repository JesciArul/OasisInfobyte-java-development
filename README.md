# 🌟 Oasis Infobyte – Java Development Internship Projects

[![GitHub Repo](https://img.shields.io/badge/GitHub-Repository-blue?style=for-the-badge&logo=github)](https://github.com/JesciArul/OasisInfobyte-java-development)
[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)

Welcome to my **Java Development Internship** repository at **Oasis Infobyte**.  
This repository contains multiple **console-based Java projects** developed during the internship, showcasing **object-oriented programming**, **data structures**, and **problem-solving skills**.

---

## 🗂️ Projects Overview

| Project | Description | Key Features |
|---------|-------------|--------------|
| **ATM Interface** | Console-based ATM simulator | Login, Deposit, Withdraw, Transfer, Transaction History |
| **Digital Library Management System** | Library management for admin & users | Admin: Add/Delete/View Books, User: Issue/Return/Search Books |
| **Number Guessing Game** | Interactive number guessing game | Random number, Attempts tracking, Score calculation |
| **Online Examination System** | Timed examination simulation | Login, Update Password, Start Exam, Auto Submission |
| **Online Reservation System** | Train ticket reservation & cancellation | Login authentication, Book/Cancel tickets, PNR generation |

---

## 💻 Technologies Used

- **Java SE (JDK 8+)**
- **Object-Oriented Programming (OOP)**
- **ArrayLists & Scanner** for data storage and input
- **Control Structures**: if-else, loops, switch-case
- **Console-based interactive UI**

---

## 🚀 How to Run

1. **Clone the repository**:

```bash
git clone https://github.com/JesciArul/OasisInfobyte-java-development.git
2. **Navigate to project folder**:

```bash
cd "OasisInfobyte-java-development/java dev"
3. **Compile Java files**:

```bash
javac *.java
4. **Run a project**:

```bash
java ATMInterface
java DigitalLibrary
java NumberGuessingGame
java OnlineExamSystem
java OnlineReservationSystem

Follow the on-screen instructions for each program.
---
## 📂 Folder Structure
```nginx
java dev/
├─ ATMInterface.java
├─ DigitalLibrary.java
├─ NumberGuessingGame.java
├─ OnlineExamSystem.java
├─ OnlineReservationSystem.java
└─ README.md
---
##✨ Key Learning Outcomes

You said:
Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>
 *  History restored 

Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>

ChatGPT said:
The error is happening because the folder you’re working in is not initialized as a Git repository yet — so Git can’t find the hidden .git folder.

Let’s fix it step by step 👍

(Your GitHub repo is hosted on GitHub, so we’ll connect to that after initializing Git locally.)

✅ Step 1 — Initialize Git in your project folder
Run this inside your java dev folder:

git init
You should see something like:

Initialized empty Git repository in ...
✅ Step 2 — Add your project files
git add .
✅ Step 3 — Make your first commit
git commit -m "Initial commit"
✅ Step 4 — Add remote repository (your GitHub repo)
git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git
✅ Step 5 — Push to GitHub
git branch -M main
git push -u origin main
🎯 Why the error happened
Git was basically saying:

“This folder is not a Git project yet.”

Because you skipped:

👉 git init

If you want, paste the output after running git init and git commit — I’ll help if anything looks confusing 😊


You said:
C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
To https://github.com/JesciArul/OasisInfobyte-java-development.git
 ! [rejected]        main -> main (fetch first)
error: failed to push some refs to 'https://github.com/JesciArul/OasisInfobyte-java-development.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>

ChatGPT said:
Good — this time Git is working 👍
The new message just means:

👉 Your remote repository on GitHub already has some files (like a README or license), and your local project doesn’t have them yet.

So Git is protecting you from overwriting remote work.

Let’s sync properly (safe way).

✅ Best & Correct Fix (Recommended)
Run this:

git pull origin main --allow-unrelated-histories
(If it opens an editor, just save & close — default message is fine.)

Then push again:

git push -u origin main
🎯 Why this happened
When you created the GitHub repo, it likely had:

✔ README.md
✔ License file

So Git sees:

Remote repo ≠ Local repo
→ needs merging first

⚠️ Alternative (ONLY if you want to overwrite GitHub completely)
If you don’t care about what’s on GitHub and want your local project to replace everything:

git push -u origin main --force
⚠ This deletes remote files.

✅ I recommend the pull method first (safer)
Try:

git pull origin main --allow-unrelated-histories
git push -u origin main
If any merge message or conflict appears, paste it here — I’ll fix it with you step by step 💪


You said:
Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>
 *  History restored 

Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Initialized empty Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Reinitialized existing Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Reinitialized existing Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git add .

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git commit -m "Initial commit"
[master (root-commit) 684adfc] Initial commit
 10 files changed, 601 insertions(+)
 create mode 100644 ATMInterface.class
 create mode 100644 ATMInterface.java
 create mode 100644 DigitalLibrary.class
 create mode 100644 DigitalLibrary.java
 create mode 100644 NumberGuessingGame.class
 create mode 100644 NumberGuessingGame.java
 create mode 100644 OnlineExamSystem.class
 create mode 100644 OnlineExamSystem.java
 create mode 100644 OnlineReservationSystem.java
 create mode 100644 User.class

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
t push -u origin main
Merge branch 'main' of https://github.com/JesciArul/OasisInfobyte-java-development
# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
~

ChatGPT said:
Nice — you actually did everything right this time 👏
What you’re seeing now is just Git asking you to confirm a merge commit message (it opened a text editor — usually Vim or Nano).

Your code is already merged — you just need to save and exit the editor.

And yes, this merge is between your local repo and the one on GitHub.

✅ If you see a screen full of text with # lines (like now)
👉 Do this (most common — Vim editor):
Press:

ESC
Then type:

:wq
Press:

Enter
✅ That means: write (save) and quit

✅ If it looks simpler (Nano editor)
Press:

CTRL + X
Then press:

Y
Then press:

Enter
🚀 After exiting, Git will finish the merge
Then if it doesn’t auto-push, run:

git push -u origin main
🎯 What just happened (simple words)
Git said:

“Remote repo has some files too — I merged them with yours.
Please confirm the merge message.”

You’re just approving it.

Try exiting the editor now — if you’re unsure what you see, describe it or paste it and I’ll guide you instantly 👍


You said:
Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>
 *  History restored 

Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Initialized empty Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Reinitialized existing Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Reinitialized existing Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git add .

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git commit -m "Initial commit"
[master (root-commit) 684adfc] Initial commit
 10 files changed, 601 insertions(+)
 create mode 100644 ATMInterface.class
 create mode 100644 ATMInterface.java
 create mode 100644 DigitalLibrary.class
 create mode 100644 DigitalLibrary.java
 create mode 100644 NumberGuessingGame.class
 create mode 100644 NumberGuessingGame.java
 create mode 100644 OnlineExamSystem.class
 create mode 100644 OnlineExamSystem.java
 create mode 100644 OnlineReservationSystem.java
 create mode 100644 User.class

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
t push -u origin main
branch 'main' of https://github.com/JesciArul/OasisInfobyte-java-development
# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines startin

ChatGPT said:
Perfect — you’re inside Git’s merge message screen right now.
Nothing is broken 👍 You just need to save and exit so Git can finish syncing with GitHub.

✅ Most likely you’re in the Vim editor (common on Windows Git)
Do this exactly:

1️⃣ Press:
ESC
2️⃣ Then type:
:wq
3️⃣ Press:
Enter
That’s it ✅

🧠 What this does
w = save the merge message

q = quit the editor

Git will complete the merge.

🚀 After it closes (if it doesn’t auto-push), run:
git push -u origin main
🎉 After this, your Java project will be uploaded successfully!
If it shows any new message after exiting, paste it here — but you’re basically at the final step now 💪


You said:
Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
fatal: not a git repository (or any of the parent directories): .git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>
 *  History restored 

Microsoft Windows [Version 10.0.19045.6466]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Initialized empty Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Reinitialized existing Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git init
Reinitialized existing Git repository in C:/Users/Lenovo/Desktop/internship/oasisInfobyte/java dev/.git/

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git add .

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git commit -m "Initial commit"
[master (root-commit) 684adfc] Initial commit
 10 files changed, 601 insertions(+)
 create mode 100644 ATMInterface.class
 create mode 100644 ATMInterface.java
 create mode 100644 DigitalLibrary.class
 create mode 100644 DigitalLibrary.java
 create mode 100644 NumberGuessingGame.class
 create mode 100644 NumberGuessingGame.java
 create mode 100644 OnlineExamSystem.class
 create mode 100644 OnlineExamSystem.java
 create mode 100644 OnlineReservationSystem.java
 create mode 100644 User.class

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git remote add origin https://github.com/JesciArul/OasisInfobyte-java-development.git

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git branch -M main

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
t push -u origin main
C

ESC

:wq

Et push -u origin main

# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
~
~
~
~
~
.git/MERGE_MSG[+] [unix] (11:32 14/02/2026)                                               9,1 All-- INSERT --

ChatGPT said:
Great — thanks for pasting the exact screen.
You’re still inside Vim (Git’s editor) and it’s in INSERT mode, so Git hasn’t finished yet.

Let’s exit it cleanly so the merge can complete and your code can go up to GitHub.

✅ Do this carefully (works 100%)
🔹 Step 1 — Leave INSERT mode
Press:

ESC
(You should see -- INSERT -- disappear)

🔹 Step 2 — Save & quit
Type exactly:

:wq
Then press:

Enter
🚀 After Vim closes
Run:

git push -u origin main
🧠 Important note (what you did earlier)
You typed ESC and :wq inside the editor text, not as commands — that’s why it didn’t exit.

They must be typed after pressing ESC (command mode).

✅ Correct flow is:
ESC → :wq → Enter

Once you do this, your repository will finally sync successfully 🎉
If anything new appears, paste it — you’re extremely close now 👍


You said:
C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
To https://github.com/JesciArul/OasisInfobyte-java-development.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to 'https://github.com/JesciArul/OasisInfobyte-java-development.git'
hint: Updates were rejected because the tip of your current branch is behind    
hint: its remote counterpart. If you want to integrate the remote changes,      
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.      

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>

ChatGPT said:
No worries — this is the last normal Git hurdle 😊
It just means the remote branch on GitHub has commits that your local branch still hasn’t fully merged.

We’ll pull once properly, then push.

✅ Run this (safe + standard)
git pull origin main --rebase
If it opens the editor again → just do:

ESC → :wq → Enter

✅ Then push:
git push -u origin main
🎯 Why this works
--rebase neatly puts:

Remote commits
⬇
Your commits on top

(no messy merge conflicts usually)

⚠️ If it shows a conflict (rare)
Paste the message — I’ll fix it with you fast.

After this, refresh your GitHub repo in browser — your Java files should appear 🎉

You’re basically done now 💪


You said:
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
To https://github.com/JesciArul/OasisInfobyte-java-development.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to 'https://github.com/JesciArul/OasisInfobyte-java-development.git'
hint: Updates were rejected because the tip of your current branch is behind    
hint: its remote counterpart. If you want to integrate the remote changes,      
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.      

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git pull origin main --rebase
error: You have not concluded your merge (MERGE_HEAD exists).
hint: Please, commit your changes before merging.
fatal: Exiting because of unfinished merge.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>(c) Microsoft Corporation. All rights reserved.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git push -u origin main
To https://github.com/JesciArul/OasisInfobyte-java-development.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to 'https://github.com/JesciArul/OasisInfobyte-java-development.git'
hint: Updates were rejected because the tip of your current branch is behind    
hint: its remote counterpart. If you want to integrate the remote changes,      
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.      

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>git pull origin main --rebase
error: You have not concluded your merge (MERGE_HEAD exists).
hint: Please, commit your changes before merging.
fatal: Exiting because of unfinished merge.

C:\Users\Lenovo\Desktop\internship\oasisInfobyte\java dev>

ChatGPT said:
Ah! Now it’s clear — Git thinks you’re in the middle of a merge and won’t let you pull or push until it’s resolved. This is why all your previous push attempts fail.

Let’s fix this step by step.

✅ Step 1 — Finish the merge
Since you have no actual changes pending, you can commit the merge message:

git commit
If an editor opens (Vim or Nano), just save & quit:

Vim: ESC → :wq → Enter

Nano: CTRL+X → Y → Enter

This will conclude the merge.

✅ Step 2 — Pull remote changes safely
After the merge is committed, run:

git pull origin main --rebase
This will replay your local commits on top of the remote branch, so nothing gets lost.

✅ Step 3 — Push to GitHub
git push -u origin main
⚠️ Alternative (force push — only if you want to overwrite remote)
If you don’t care about remote files, you can do:

git push -u origin main --force
Warning: This will replace everything on GitHub with your local repo. Safe only if the remote only has a README or placeholder files.

If you want, I can give you the exact sequence of commands that will guarantee your Java project goes to GitHub safely without overwriting anything important.

Do you want me to do that?


You said:
Microsoft Windows [Version 10.0.19045.6466]
Merge branch 'main' of https://github.com/JesciArul/OasisInfobyte-java-development
# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
#
# It looks like you may be committing a merge.
# If this is not correct, please run
#       git update-ref -d MERGE_HEAD
# and try again.


# Please enter the commit message for your changes. Lines starting
# with '#' will be ignored, and an empty message aborts the commit.
#
# On branch main
# All conflicts fixed but you are still merging.
.git/COMMIT_EDITMSG [unix] (11:37 14/02/2026)                            1,1 Top
<nship/oasisInfobyte/java dev/.git/COMMIT_EDITMSG" [unix] 32L, 1145B

ChatGPT said:
Ah! Perfect — this is exactly the merge commit screen in Vim. Git is telling you:

“You are in the middle of a merge. All conflicts are resolved. Please confirm the merge commit message.”

Right now, Vim is in INSERT mode (that’s why you see the cursor at the bottom). We just need to exit properly.

✅ Step 1 — Exit INSERT mode
Press:

ESC
You should see -- INSERT -- disappear at the bottom.

✅ Step 2 — Save and quit
Type:

:wq
Then press Enter

w = write (save)

q = quit

This will finalize the merge.

✅ Step 3 — Pull remote changes safely (if needed)
git pull origin main --rebase
✅ Step 4 — Push your code
git push -u origin main
💡 Explanation:

You were stuck because Git thought a merge was unfinished.

By saving and quitting this Vim screen, you complete the merge, and Git will let you pull/push normally.

After this, your Java project should appear on GitHub.

If you want, I can give a one-shot sequence of commands that guarantees your repo is fully synced safely. Do you want me to do that?


You said:
Microsoft Windows [Version 10.0.19045.6466]
# Please enter the commit message for your changes. Lines starting
# with '#' will be ignored, and an empty message aborts the commit.
#
# On branch main
# All conflicts fixed but you are still merging.
#
# Changes to be committed:
#       new file:   README.md
#       new file:   java dev/ATMInterface.class
#       new file:   java dev/ATMInterface.java
#       new file:   java dev/DigitalLibrary.class
#       new file:   java dev/DigitalLibrary.java
#       new file:   java dev/NumberGuessingGame.class
#       new file:   java dev/NumberGuessingGame.java
#       new file:   java dev/OnlineExamSystem.class
#       new file:   java dev/OnlineExamSystem.java
#       new file:   java dev/OnlineReservationSystem.java
#       new file:   java dev/User.class

ChatGPT said:
Perfect — now Git is showing you the merge commit screen. This is normal — it’s waiting for you to finalize the merge so it can continue.

Right now, you’re in Vim (Git’s default editor) and probably in INSERT mode.

Here’s exactly what to do:

1️⃣ Exit INSERT mode
Press:

ESC
You should see -- INSERT -- disappear.

2️⃣ Save and quit
Type exactly:

:wq
Then press Enter

✅ This tells Git: “I confirm this merge commit.”

3️⃣ Push your code to GitHub
git push -u origin main
Now your Java project + README will be on your GitHub repo.

💡 Tip:
This merge commit is just Git combining your local files with the existing remote README. After you do this, all future commits/pushes should be smooth.

If you want, I can give a step-by-step one-shot command sequence to get your repo fully synced without getting stuck in Vim again.

Do you want me to do that?


You said:
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ATMInterface {
   static Scanner sc;
   static String userId;
   static String userPin;
   static double balance;
   static double targetBalance;
   static ArrayList<String> history;

   public ATMInterface() {
   }

   static boolean login() {
      System.out.print("Enter User ID: ");
      String var0 = sc.next();
      System.out.print("Enter PIN: ");
      String var1 = sc.next();
      return var0.equals(userId) && var1.equals(userPin);
   }

   static void showHistory() {
      if (history.isEmpty()) {
         System.out.println("No transactions yet.");
      } else {
         System.out.println("\n--- Transaction History ---");
         Iterator var0 = history.iterator();

         while(var0.hasNext()) {
            String var1 = (String)var0.next();
            System.out.println(var1);
         }
      }

   }

   static void withdraw() {
      System.out.print("Enter amount to withdraw: ");
      double var0 = sc.nextDouble();
      if (var0 <= balance) {
         balance -= var0;
         history.add("Withdrawn: ₹" + var0);
         System.out.println("Withdrawal Successful!");
      } else {
         System.out.println("Insufficient Balance!");
      }

   }

   static void deposit() {
      System.out.print("Enter amount to deposit: ");
      double var0 = sc.nextDouble();
      balance += var0;
      history.add("Deposited: ₹" + var0);
      System.out.println("Deposit Successful!");
   }

   static void transfer() {
      System.out.print("Enter amount to transfer: ");
      double var0 = sc.nextDouble();
      if (var0 <= balance) {
         balance -= var0;
         targetBalance += var0;
         history.add("Transferred: ₹" + var0);
         System.out.println("Transfer Successful!");
      } else {
         System.out.println("Insufficient Balance!");
      }

   }

   public static void main(String[] var0) {
      System.out.println("\ud83c\udfe7 Welcome to ATM Interface \ud83c\udfe7");
      if (!login()) {
         System.out.println("Invalid Login Credentials!");
      } else {
         System.out.println("Login Successful!");

         int var1;
         do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            var1 = sc.nextInt();
            switch (var1) {
               case 1:
                  showHistory();
                  break;
               case 2:
                  withdraw();
                  break;
               case 3:
                  deposit();
                  break;
               case 4:
                  transfer();
                  break;
               case 5:
                  System.out.println("Thank you for using ATM!");
                  break;
               default:
                  System.out.println("Invalid Choice!");
            }

            System.out.println("Current Balance: ₹" + balance);
         } while(var1 != 5);

         sc.close();
      }
   }

   static {
      sc = new Scanner(System.in);
      userId = "user123";
      userPin = "1234";
      balance = 10000.0;
      targetBalance = 5000.0;
      history = new ArrayList();
   }
}import java.util.*;

public class DigitalLibrary {

    static Scanner sc = new Scanner(System.in);

    
    static ArrayList<String> books = new ArrayList<>();
    static ArrayList<String> issuedBooks = new ArrayList<>();

    static String adminId = "admin";
    static String adminPass = "admin123";

    static String userId = "user";
    static String userPass = "user123";

    
    static void adminModule() {
        int choice;
        do {
            System.out.println("\n--- Admin Module ---");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. View Books");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    books.add(sc.nextLine());
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter book name to delete: ");
                    String b = sc.nextLine();
                    if (books.remove(b))
                        System.out.println("Book Deleted!");
                    else
                        System.out.println("Book Not Found!");
                    break;

                case 3:
                    System.out.println("\nAvailable Books:");
                    for (String book : books)
                        System.out.println("- " + book);
                    break;

                case 4:
                    System.out.println("Admin Logged Out!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }

    
    static void userModule() {
        int choice;
        do {
            System.out.println("\n--- User Module ---");
            System.out.println("1. View Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (String book : books)
                        System.out.println("- " + book);
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    String search = sc.nextLine();
                    if (books.contains(search))
                        System.out.println("Book Available!");
                    else
                        System.out.println("Book Not Found!");
                    break;

                case 3:
                    System.out.print("Enter book to issue: ");
                    String issue = sc.nextLine();
                    if (books.remove(issue)) {
                        issuedBooks.add(issue);
                        System.out.println("Book Issued Successfully!");
                    } else {
                        System.out.println("Book Not Available!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book to return: ");
                    String ret = sc.nextLine();
                    if (issuedBooks.remove(ret)) {
                        books.add(ret);
                        System.out.println("Book Returned Successfully!");
                    } else {
                        System.out.println("Invalid Book!");
                    }
                    break;

                case 5:
                    System.out.println("User Logged Out!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {

        
        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Operating Systems");

        System.out.println("=== Digital Library Management System ===");
        System.out.print("Login as (Admin/User): ");
        String role = sc.next();

        System.out.print("Enter ID: ");
        String id = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (role.equalsIgnoreCase("Admin") && id.equals(adminId) && pass.equals(adminPass)) {
            adminModule();
        } 
        else if (role.equalsIgnoreCase("User") && id.equals(userId) && pass.equals(userPass)) {
            userModule();
        } 
        else {
            System.out.println("Invalid Login Credentials!");
        }

        sc.close();
    }
}
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public NumberGuessingGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      int var3 = 0;
      System.out.println("\ud83c\udfae Welcome to the Number Guessing Game \ud83c\udfae");

      char var4;
      do {
         int var5 = var2.nextInt(100) + 1;
         int var6 = 5;
         boolean var7 = false;
         System.out.println("\nI have generated a number between 1 and 100.");
         System.out.println("You have " + var6 + " attempts to guess it!");

         for(; var6 > 0; System.out.println("Attempts left: " + var6)) {
            System.out.print("Enter your guess: ");
            int var8 = var1.nextInt();
            --var6;
            if (var8 == var5) {
               System.out.println("\ud83c\udf89 Correct! You guessed the number!");
               int var9 = (var6 + 1) * 10;
               System.out.println("Points earned: " + var9);
               var3 += var9;
               var7 = true;
               break;
            }

            if (var8 > var5) {
               System.out.println("\ud83d\udcc9 Too High!");
            } else {
               System.out.println("\ud83d\udcc8 Too Low!");
            }
         }

         if (!var7) {
            System.out.println("❌ You've used all attempts!");
            System.out.println("The correct number was: " + var5);
         }

         System.out.println("\nTotal Score: " + var3);
         System.out.print("Do you want to play another round? (Y/N): ");
         var4 = var1.next().charAt(0);
      } while(var4 == 'Y' || var4 == 'y');

      System.out.println("\n\ud83c\udfc1 Game Over!");
      System.out.println("Final Score: " + var3);
      var1.close();
   }
}// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class OnlineExamSystem {
   static User user = new User();
   static Scanner sc;
   static int score;
   static boolean submitted;

   public OnlineExamSystem() {
   }

   public static void login() {
      System.out.print("Username: ");
      String var0 = sc.next();
      System.out.print("Password: ");
      String var1 = sc.next();
      if (var0.equals(user.username) && var1.equals(user.password)) {
         System.out.println("Login Successful!\n");
         menu();
      } else {
         System.out.println("Invalid Login!\n");
      }

   }

   public static void updatePassword() {
      System.out.print("Enter new password: ");
      user.password = sc.next();
      System.out.println("Password Updated Successfully!\n");
   }

   public static void startExam() {
      Thread var0 = new Thread(() -> {
         try {
            for(int var0 = 30; var0 >= 0; --var0) {
               if (submitted) {
                  return;
               }

               System.out.println("Time Left: " + var0 + " seconds");
               Thread.sleep(1000L);
            }

            System.out.println("\nTime Over! Auto Submitting...");
            submitted = true;
            showResult();
         } catch (Exception var1) {
         }

      });
      var0.start();
      askQuestions();
   }

   public static void askQuestions() {
      String[][] var0 = new String[][]{{"Java is ___ ?", "1) OOP", "2) OS", "3) Browser", "4) DB", "1"}, {"JVM stands for?", "1) Java Virtual Machine", "2) Java Verify Mode", "3) Joint VM", "4) None", "1"}, {"Which is not OOP?", "1) Java", "2) C++", "3) Python", "4) C", "4"}};

      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (submitted) {
            return;
         }

         System.out.println("\n" + var0[var1][0]);
         System.out.println(var0[var1][1]);
         System.out.println(var0[var1][2]);
         System.out.println(var0[var1][3]);
         System.out.println(var0[var1][4]);
         System.out.print("Your Answer: ");
         String var2 = sc.next();
         if (var2.equals(var0[var1][5])) {
            ++score;
         }
      }

      submitted = true;
      showResult();
   }

   public static void showResult() {
      System.out.println("\nExam Finished!");
      System.out.println("Score: " + score + "/3\n");
   }

   public static void menu() {
      while(true) {
         System.out.println("1. Update Password");
         System.out.println("2. Start Exam");
         System.out.println("3. Logout");
         System.out.print("Choice: ");
         int var0 = sc.nextInt();
         switch (var0) {
            case 1:
               updatePassword();
               break;
            case 2:
               startExam();
               break;
            case 3:
               System.out.println("Logged out successfully!");
               System.exit(0);
            default:
               System.out.println("Invalid Option\n");
         }
      }
   }

   public static void main(String[] var0) {
      System.out.println("=== Online Examination System ===");
      login();
   }

   static {
      sc = new Scanner(System.in);
      score = 0;
      submitted = false;
   }
}import java.util.*;

class Reservation {
    String name;
    int age;
    int trainNo;
    String trainName;
    String classType;
    String date;
    String from;
    String to;
    int pnr;

    Reservation(String name, int age, int trainNo, String trainName,
                String classType, String date, String from, String to, int pnr) {
        this.name = name;
        this.age = age;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.classType = classType;
        this.date = date;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
    }

    void display() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("PNR Number   : " + pnr);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Train No     : " + trainNo);
        System.out.println("Train Name   : " + trainName);
        System.out.println("Class Type   : " + classType);
        System.out.println("Journey Date : " + date);
        System.out.println("From         : " + from);
        System.out.println("To           : " + to);
    }
}

public class OnlineReservationSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Reservation> reservations = new ArrayList<>();
    static Random rand = new Random();

    
    static boolean login() {
        System.out.print("Enter Login ID: ");
        String id = sc.next();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        return id.equals("admin") && pass.equals("admin123");
    }

    
    static String getTrainName(int trainNo) {
        switch (trainNo) {
            case 101: return "Rajdhani Express";
            case 102: return "Shatabdi Express";
            case 103: return "Duronto Express";
            default: return "Unknown Train";
        }
    }


    static void reservation() {
        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Train Number (101/102/103): ");
        int trainNo = sc.nextInt();

        String trainName = getTrainName(trainNo);
        System.out.println("Train Name: " + trainName);

        System.out.print("Enter Class Type (Sleeper/AC): ");
        String classType = sc.next();

        System.out.print("Enter Journey Date (dd-mm-yyyy): ");
        String date = sc.next();

        System.out.print("From: ");
        String from = sc.next();

        System.out.print("To: ");
        String to = sc.next();

        int pnr = rand.nextInt(9000) + 1000;

        reservations.add(new Reservation(name, age, trainNo, trainName,
                classType, date, from, to, pnr));

        System.out.println("\nReservation Successful!");
        System.out.println("Your PNR Number is: " + pnr);
    }

    
    static void cancellation() {
        System.out.print("Enter PNR Number: ");
        int pnr = sc.nextInt();

        Iterator<Reservation> itr = reservations.iterator();
        while (itr.hasNext()) {
            Reservation r = itr.next();
            if (r.pnr == pnr) {
                r.display();
                System.out.print("\nConfirm Cancellation (Y/N): ");
                char ch = sc.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    itr.remove();
                    System.out.println("Ticket Cancelled Successfully!");
                }
                return;
            }
        }
        System.out.println("Invalid PNR Number!");
    }

    public static void main(String[] args) {

        System.out.println("=== Online Reservation System ===");

        if (!login()) {
            System.out.println("Invalid Login Credentials!");
            return;
        }

        int choice;
        do {
            System.out.println("\n1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: reservation(); break;
                case 2: cancellation(); break;
                case 3: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
    }
}  these are myy oasisinfobyte internships tasks of  javva  devvelopment  proggrammming proovide an effeccint cclran annd proffessiinal readme to ssubit my inernsshhip liinnk througgh my giithub 




ChatGPT said:
Absolutely! I can draft a professional, clean, and GitHub-ready README for your Oasis Infobyte Java Development Internship projects. I’ll make it structured, easy to read, and highlight each project clearly so it looks impressive to reviewers. Here’s a ready-to-use template:

Oasis Infobyte – Java Development Internship Projects
Welcome to my Java Development Internship repository at Oasis Infobyte.
This repository contains multiple Java projects developed during the internship, demonstrating object-oriented programming, data structures, console-based applications, and basic user interaction.

🗂️ Projects Overview
Project Name	Description	Key Features
ATM Interface	A console-based ATM simulator	Login with user credentials, Deposit, Withdraw, Transfer, Transaction History
Digital Library Management System	Simulates library operations for admin and users	Admin: Add/Delete/View Books, User: Issue/Return/Search Books
Number Guessing Game	Interactive number guessing game with scoring system	Random number generation, Attempts tracking, Score calculation
Online Examination System	Simulates a simple timed exam system	Login, Update Password, Start Exam, Auto Submission on Time Out
Online Reservation System	Train ticket reservation and cancellation system	Login authentication, Book & Cancel tickets, PNR generation, Reservation history
💻 Technologies Used
Java SE (JDK 8+)

Object-Oriented Programming (OOP) concepts

ArrayList & Scanner for data storage and input

Control Structures (if-else, loops, switch-case)

Basic console-based UI

🚀 How to Run
Clone the repository:

git clone https://github.com/JesciArul/OasisInfobyte-java-development.git
Navigate to the project folder:

cd "OasisInfobyte-java-development/java dev"
Compile the Java files:

javac *.java
Run the desired project:

java ATMInterface
java DigitalLibrary
java NumberGuessingGame
java OnlineExamSystem
java OnlineReservationSystem
Each program runs independently in the console. Follow on-screen instructions.

📂 Folder Structure
java dev/
├─ ATMInterface.java
├─ DigitalLibrary.java
├─ NumberGuessingGame.java
├─ OnlineExamSystem.java
├─ OnlineReservationSystem.java
└─ README.md
✨ Key Learning Outcomes
Implemented real-world Java applications using OOP concepts.

Learned file-less console application design and user input handling.

Gained experience in problem-solving and logic building for multiple application scenarios.

Understood transaction management, data storage using ArrayLists, and menu-driven program design.

📌 Notes
All programs are console-based and self-contained.

User credentials are pre-defined in the code for demonstration purposes.

This repository serves as a portfolio of Java projects completed during the internship.

🔗 Internship Submission Link
Oasis Infobyte Java Development Internship Projects

✅ Tip: Add this README file to the root of your repository as README.md. This will make your GitHub page look professional and complete for submission.

If you want, I can also make an even cleaner GitHub “showcase-style” README with badges, emojis, and sections for screenshots or demo videos, which usually impresses internship reviewers even more.

Do you want me to do that next?


You said:
provide coode  foor this radme

ChatGPT said:
Absolutely! Here’s a ready-to-use README.md file you can directly copy and add to your repository. I’ve included badges, headings, code blocks, and a professional layout that will make your GitHub repo look polished for your internship submission:

# 🌟 Oasis Infobyte – Java Development Internship Projects

Welcome to my **Java Development Internship** repository at **Oasis Infobyte**.  
This repository contains multiple Java projects developed during the internship, demonstrating **object-oriented programming**, **data structures**, **console-based applications**, and **user interaction**.

---

## 🗂️ Projects Overview

| Project Name | Description | Key Features |
|--------------|-------------|--------------|
| **ATM Interface** | Console-based ATM simulator | Login, Deposit, Withdraw, Transfer, Transaction History |
| **Digital Library Management System** | Library operations for admin and users | Admin: Add/Delete/View Books, User: Issue/Return/Search Books |
| **Number Guessing Game** | Interactive number guessing game | Random number, Attempts tracking, Score calculation |
| **Online Examination System** | Simulates a timed exam system | Login, Update Password, Start Exam, Auto Submission |
| **Online Reservation System** | Train ticket reservation & cancellation | Login authentication, Book/Cancel tickets, PNR generation |

---

## 💻 Technologies Used

- **Java SE (JDK 8+)**
- **Object-Oriented Programming (OOP) concepts**
- **ArrayList & Scanner** for data storage and input
- **Control Structures** (if-else, loops, switch-case)
- **Console-based UI**

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/JesciArul/OasisInfobyte-java-development.git
Navigate to the project folder:

cd "OasisInfobyte-java-development/java dev"
Compile the Java files:

javac *.java
Run the desired project:

java ATMInterface
java DigitalLibrary
java NumberGuessingGame
java OnlineExamSystem
java OnlineReservationSystem
Each program runs independently in the console. Follow on-screen instructions.

📂 Folder Structure
java dev/
├─ ATMInterface.java
├─ DigitalLibrary.java
├─ NumberGuessingGame.java
├─ OnlineExamSystem.java
├─ OnlineReservationSystem.java
└─ README.md
✨ Key Learning Outcomes
Built real-world Java applications using OOP concepts.

Developed menu-driven console programs with user input handling.

Implemented transaction and data management using ArrayLists.

Improved problem-solving skills and logical thinking for multiple scenarios.

📌 Notes
All programs are console-based and self-contained.

Pre-defined credentials are used for demonstration.

This repository serves as a portfolio of Java projects completed during the internship.

🔗 Internship Submission Link
Oasis Infobyte Java Development Internship Projects


---

💡 **Instructions to use**:

1. Copy the above content.
2. Create a file named `README.md` in the root of your repository.
3. Paste the content and save.
4. Commit and push:

```bash
git add README.md
git commit -m "Add professional README"
git push
If you want, I can make a next-level version with badges, emojis, and a project demo section that looks very professional on GitHub — almost like a portfolio showcase.

Do you want me to do that?


You said:
yes proovide entire ccode foorr the readme

ChatGPT said:
Perfect! Here's a full, polished, professional README.md code for your GitHub internship repository. I’ve added badges, emojis, project showcase sections, and clean formatting so it looks like a professional portfolio. You can copy this directly into your README.md file:

# 🌟 Oasis Infobyte – Java Development Internship Projects

[![GitHub Repo](https://img.shields.io/badge/GitHub-Repository-blue?style=for-the-badge&logo=github)](https://github.com/JesciArul/OasisInfobyte-java-development)
[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)

Welcome to my **Java Development Internship** repository at **Oasis Infobyte**.  
This repository contains multiple **console-based Java projects** developed during the internship, showcasing **object-oriented programming**, **data structures**, and **problem-solving skills**.

---

## 🗂️ Projects Overview

| Project | Description | Key Features |
|---------|-------------|--------------|
| **ATM Interface** | Console-based ATM simulator | Login, Deposit, Withdraw, Transfer, Transaction History |
| **Digital Library Management System** | Library management for admin & users | Admin: Add/Delete/View Books, User: Issue/Return/Search Books |
| **Number Guessing Game** | Interactive number guessing game | Random number, Attempts tracking, Score calculation |
| **Online Examination System** | Timed examination simulation | Login, Update Password, Start Exam, Auto Submission |
| **Online Reservation System** | Train ticket reservation & cancellation | Login authentication, Book/Cancel tickets, PNR generation |

---

## 💻 Technologies Used

- **Java SE (JDK 8+)**
- **Object-Oriented Programming (OOP)**
- **ArrayLists & Scanner** for data storage and input
- **Control Structures**: if-else, loops, switch-case
- **Console-based interactive UI**

---

## 🚀 How to Run

1. **Clone the repository**:

```bash
git clone https://github.com/JesciArul/OasisInfobyte-java-development.git
Navigate to project folder:

cd "OasisInfobyte-java-development/java dev"
Compile Java files:

javac *.java
Run a project:

java ATMInterface
java DigitalLibrary
java NumberGuessingGame
java OnlineExamSystem
java OnlineReservationSystem
Follow the on-screen instructions for each program.

📂 Folder Structure
java dev/
├─ ATMInterface.java
├─ DigitalLibrary.java
├─ NumberGuessingGame.java
├─ OnlineExamSystem.java
├─ OnlineReservationSystem.java
└─ README.md
✨ Key Learning Outcomes
Built real-world Java applications using OOP concepts.

Developed menu-driven console programs with user input handling.

Implemented transaction and data management using ArrayLists.

Learned problem-solving skills and logical thinking for multiple scenarios.

Gained experience in project organization and GitHub repository management.

📝 Notes
All projects are console-based and self-contained.

Pre-defined credentials are included for demonstration purposes.

This repository serves as a portfolio of Java projects completed during the internship

