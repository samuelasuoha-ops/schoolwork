# SCRIPTING ASSESSMENT EXAM
# Name: Samuel Asuoha
# Student Number: C00305107

# This is a dictionary that contains locations, directions, and items of the game.
g_locations = {
    'Tower': {'north': 'Throne Room', 'east': 'Armory', 'south': 'Dungeon', 'item': 'map'},
    'Throne Room': {'south': 'Tower', 'item': 'crown'},
    'Armory': {'west': 'Tower', 'north': 'Library', 'item': 'sword'},
    'Library': {'south': 'Armory', 'item': 'spellbook'},
    'Dungeon': {'north': 'Tower', 'item': 'dragon'}
}

# This is the function to display game options
def show_game_options() -> None:
    print("""
    The 'Knight in the Kingdom', a textual 'Adventure Game'
    ===========================
    Commands:
    	go [north|south|east|west] - Move in the specified direction
    	get [item] - Pick up an item
    	inspect room - See the items in the current room
    	inspect inventory - See the items in your inventory

    """)

# This is the function to show player's current status
def show_status(current_location: str, locations: dict) -> None:
    print(f"You are in the {current_location}")
    directions = ", ".join(locations[current_location].keys() - {"item"})
    print(f"Directions available: {directions}")
    if "item" in locations[current_location]:
        print(f"You see a {locations[current_location]['item']} here.")

# This is the function to inspect the player's inventory
def inspect_inventory(inventory: list) -> None:
    if inventory:
        print(f"Your inventory contains: {', '.join(inventory)}")
    else:
        print("Your inventory is empty.")

# This is the function to inspect the current location
def inspect_location(current_location: str, locations: dict) -> None:
    if "item" in locations[current_location]:
        print(f"In this room, you see: {locations[current_location]['item']}")
    else:
        print("The room is empty.")

# This is the function to get the player's command
def get_command() -> tuple:
    command = input("Enter your command: ").strip().lower()
    if len(command.split()) == 2:
        action, target = command.split()
        return action, target
    else:
        print("Invalid command. Try 'go [direction]', 'get [item]', or 'inspect [room/inventory]'.")
        return None, None

# This is the function to move to the next location
def move_to_next_location(current_location: str, target: str, locations: dict) -> str:
    if target in locations[current_location]:
        return locations[current_location][target]
    else:
        print("You can't go that way!")
        return current_location

# This is the function to pick up an item
def pickup_item(target: str, inventory: list, current_location: str, locations: dict) -> None:
    if "item" in locations[current_location] and locations[current_location]["item"] == target:
        inventory.append(target)
        print(f"You picked up the {target}!")
        del locations[current_location]["item"]
    else:
        print(f"Sorry, there is no {target} here.")

# This is the main game loop function
def game_mainloop(first_location: str, locations: dict) -> bool:
    current_location = first_location
    inventory = []
    show_game_options()

    while True:
        show_status(current_location, locations)

        # This gets the player's next action
        action, target = get_command()

        if action == "go":
            current_location = move_to_next_location(current_location, target, locations)
        elif action == "get":
            pickup_item(target, inventory, current_location, locations)
        elif action == "inspect":
            if target == "inventory":
                inspect_inventory(inventory)
            elif target == "room":
                inspect_location(current_location, locations)
            else:
                print("Cannot inspect that.")
        else:
            print("Invalid command.")

        # This checks winning condition
        if current_location == 'Throne Room' and 'crown' in inventory and 'sword' in inventory:
            print("Congratulations! You have claimed the throne with the crown and the sword!")
            break

        # This checks losing condition
        if 'item' in locations[current_location] and locations[current_location]['item'] == 'dragon':
            if 'sword' in inventory:
                print("You defeated the dragon! You can continue your quest.")
                del locations[current_location]["item"]
            else:
                print("The dragon has defeated you... Game Over!")
                break

    return True

# This funtion runs the game
game_mainloop('Tower', g_locations)



