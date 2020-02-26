# CTI 110
# P3HW1 - Color Mixer
# Ryan Hodgson
# 02/26/2020

def main():
 # Asking for color 1 and color 2 

    input1 = input('Please enter a color between red, yellow, and blue: ')
    input2 = input('Please enter a different color between red, yellow and blue: ')

 # Processing the mixture of colors & Output the results.
 

    if input1 == 'red' and input2 == 'yellow' or input1 == 'yellow' and input2 == 'red':
        print('Orange')
    elif input1 == 'blue' and input2 == 'yellow' or input1 == 'yellow' and input2 == 'blue':
        print('Green')
    elif input1 == 'blue' and input2 == 'red' or input1 == 'red' and input2 == 'blue':
        print('Purple')

 # If the color is not defined, it will result in error

    else:
        print('Error')

main()
