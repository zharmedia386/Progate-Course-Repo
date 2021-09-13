from menu_item import MenuItem

# Move the code above to menu_item.py

# Import the MenuItem class from menu_item.py
menu_item1 = MenuItem('Sandwich', 5)

print(menu_item1.info())

result = menu_item1.get_total_price(4)
print('Your total is $' + str(result))
