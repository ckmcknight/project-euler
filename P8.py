# Written in Python for easier file manipulation.
# Find the largest product of 13 adjacent numbers that can be found in the
# integer in the accompanying file P8Number.txt

#Reads the number in as a string
def readNum(fileName):
    f = open(fileName)
    return f.read().replace("\n", "")

def largestProduct(fileName, numDigits):
    number = readNum(fileName)
    maxProduct = 0
    for x in range(0, len(number) - numDigits):
        substring = number[x : x + numDigits]
        maxProduct = max(maxProduct, substringProduct(substring))
    return maxProduct

def substringProduct(substring):
    product = 1
    for x in substring:
        product *= int(x)
    return product

print(largestProduct('P8Number.txt', 13))
