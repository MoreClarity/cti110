# Getting the total sales for a sales prediction 
# 2/17/2020
# CTI 110 P2T1-Sales Prediction
# Ryan Hodgson
def main():
    # Get the total projected sales.
        total_sales = float(input('Enter the projected sales: '))

    # Calculate the profit as 23 percent of total sales.
        profit = total_sales * 0.23

    # Display profit.
        print ('The profit is $', format(profit, ',.2f'))

main()
    
