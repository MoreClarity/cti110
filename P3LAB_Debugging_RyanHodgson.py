# CTI-110
# P3LAB - Debugging
# Ryan Hodgson
# 02/24/2020
# If the score is greater than or equal to 90, then the grade is A
#   Else, if the score is greater than or equal to 80,then the grade is B
#       Else, if the score is greater than or equal to 70, then the grade is C
#            Else, if the score is greater than or equal to 60, then the grade is D.
#               Else, the grade is F
def main():

    score = int(input('enter numerical score.'))

    if score >= 90:
        print('Your grade is A.')
        if score >= 80:
            print('Your grade is B.')
            if score >= 70:
                print('Yout grade is C.')
                if score >=60:
                    print('Your grade is D.')
                else:
                    print('Your grade is F.')

main()
