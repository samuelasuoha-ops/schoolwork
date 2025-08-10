#import statistics Library
import statistics as st

#Add this library to be able to graph the data
import matplotlib.pyplot as plt

#imports text file as a string

myfile = open("weather.csv","r")
dataIn = myfile.read()

#file is going to be too large to print in Jupyter Notebook
#create a 1D list split by carrage return

instances1D = dataIn.split("\n")

#Create a 2D list
output2D =[]

#Make a temp list for each row and add these to the 2D list
for instance in instances1D[1:]:
    templist = instance.replace("\t",",").split(",")
    output2D.append(templist)

print(output2D)