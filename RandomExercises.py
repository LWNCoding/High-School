import random

#Part A
#Tracks odds of the sum of two dice rolls
rolled = dict()
rolled[2] = 0
rolled[3] = 0
rolled[4] = 0
rolled[5] = 0
rolled[6] = 0
rolled[7] = 0
rolled[8] = 0
rolled[9] = 0
rolled[10] = 0
rolled[11] = 0
rolled[12] = 0

def roll2dice():
	dice1 = random.randint(1,6)
	dice2 = random.randint(1,6)
	dice_total = dice1 + dice2
	return dice_total

def do100():
	for c in range(0,1000):
		dice_total = roll2dice()
		rolled[dice_total] = rolled[dice_total] + 1	
		
do100()
def percentages():
	for key in rolled:
		rolled[key] = rolled[key] / 10
	print("2    " , rolled[2],"%    ", "2.77 %")
	print("3    " , rolled[3],"%    ", "5.55 %")
	print("4    " , rolled[4],"%    ", "8.33 %")
	print("5   " , rolled[5],"%   ", "11.11 %")
	print("6   " , rolled[6],"%   ", "13.88 %")
	print("7   " , rolled[7],"%   ", "16.66 %")
	print("8   " , rolled[8],"%   ", "13.88 %")
	print("9   " , rolled[9],"%   ", "11.11 %")
	print("10   " , rolled[10],"%    ", "8.33 %")
	print("11   " , rolled[11],"%    ", "5.55 %")
	print("12   " , rolled[12],"%    ", "2.77 %")
	
percentages()	

print("\n")

#---------------------------------------------------------------------------------
#Generate a password that is 8-10 characters long, has at least:
#one lowercase character
#one uppercase character
#one special character
#one number
#Part B
lower_chars = "abcdefghijklmnopqrstuvwxyz"
upper_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
spec_chars = "$#@"
nums = "123456789"

def password_check(password):
	counter = 0
	counterC1 = 0
	counterC2 = 0
	counterC3 = 0
	counterC4 = 0
	for c in password:
		if c in lower_chars:
			counterC1 = counterC1 + 1
	if counterC1 > 0:
		counter = counter + 1
	for c in password:
		if c in upper_chars:
			counterC2 = counterC2 + 1
	if counterC2 > 0:
		counter = counter + 1
	for c in password:
		if c in spec_chars:
			counterC3 = counterC3 + 1
	if counterC3 > 0:
		counter = counter + 1
	for c in password:
		if c in nums:
			counterC4 = counterC4 + 1
	if counterC4 > 0:
		counter = counter + 1
	if counter == 4:
		print("The password", password, "is valid")
	else:
		password_generator()

def password_generator():
	chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789$#@"
	random_password = "" 
	for c in range(random.randint(8,10)):
		random_password += random.choice(chars)
	password_check(random_password)
	
password_generator()

print("\n")

#---------------------------------------------------------------------------------
#Create a deck of cards and deals X hands of Y cards

#Part C	
numbers = "A23456789TJQK"
def create_deck():
	global deck
	deck = []
	for c in range(len(numbers)):
		x = numbers[c] + "s"
		deck.append(x)
	for c in range(len(numbers)):
		x = numbers[c] + "c"
		deck.append(x)
	for c in range(len(numbers)):
		x = numbers[c] + "h"
		deck.append(x)
	for c in range(len(numbers)):
		x = numbers[c] + "d"
		deck.append(x)	
	return deck
	
def shuffle():
	x = create_deck()
	z = []
	for c in range(len(x)):
		d = random.choice(x)
		z.append(d)
		x.remove(d)
	return z

def deal(x,y,z):
	lists = [[] for c in range(x)]
	for c in lists:
		for l in range(y):
			random_card = random.choice(z)
			c.append(random_card)
			z.remove(random_card)
	print(lists)

deal(3,2,shuffle())
