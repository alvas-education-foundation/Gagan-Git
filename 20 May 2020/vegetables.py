import time
import os

while True:
    if os.path.exists("veg.txt"):
        with open("veg.txt") as file:
            print(file.read())
    else:
        print("File does not exists.")
    time.sleep(5)