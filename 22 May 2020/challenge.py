#Developer: Gagan M K
#E-mail: gagan.m.kabadi@gmail.com
#Github: Gaganmkabadi 



#Write python code to verify user_name = "Micheal" and password ="e3$WT89x". 
#The total number of attempts are 03. 
#For every wrong user_name and password Print - Invalid username or Password, upon three attempts fails print- Account locked
#If inputs are correct Print - You have successfully login



def para(user_name, password):
    
    if user_name == "Micheal" and password == "e3$WT89x":
        return "You have successfully login"
    attempt = 0   
    while attempt <= 3:
        if attempt == 2:
            return "Account locked"
        else:
            print ("Invalid username or Password")
            u= input("Enter the username: ")
            p =  input("Password: ")
            if u == "Micheal" and p == "e3$WT89x":
                return "You have successfully login"
            attempt = attempt+1
            
                        
u= input("Enter the username: ")
p =  input("Password: ")
print(para(u,p))