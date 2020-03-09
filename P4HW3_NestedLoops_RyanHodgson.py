# Nested loops
# 03/09/2020
# CTI-110 P4HW3 - Nested Loops
# Ryan Hodgson
#

def main():
    for row in range ( 6 ):
        print( '#', end='', sep='' )
        for spaces in range( row ):
            print( ' ', end='', sep='' )
        print( '#', sep='' )

main()
