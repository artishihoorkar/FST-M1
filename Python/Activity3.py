print("Player 1 input - Rock, Paper, Scissor?")
x=input()
print("Player 2 input - Rock, Paper, Scissor?")
y=input()
if((x=="Rock" and y=="Scissor") or (x=="rock" and y=="scissor")):
    print("Rock beat Scissor, Player 1 wins")
elif((x=="Scissor" and y=="Paper") or (x=="scissor" and y=="paper")):
    print("Scissor beat Paper, Player 1 wins")
elif((x=="Paper" and y=="Rock") or (x=="paper" and y=="rock")):
    print("Paper beat Rock, Player 1 wins")
elif((x=="Scissor" and y=="Rock") or (x=="scissor" and y=="rock")):
    print("Rock beat Scissor, Player 2 wins")
elif((x=="Paper" and y=="Scissor") or (x=="paper" and y=="scissor")):
    print("Scissor beat Paper, Player 2 wins")
elif((x=="Rock" and y=="Paper") or (x=="rock" and y=="paper")):
    print("Paper beat Rock, Player 2 wins")
elif((x=="Rock" and y== "Rock") or (x=="Scissor" and y== "Scissor") or (x=="Paper" and y== "Paper") or (x=="rock" and y== "rock") or (x=="scissor" and y== "scissor") or (x=="paper" and y== "paper")):
    print("Same input, try again")