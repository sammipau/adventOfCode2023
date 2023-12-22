import re
# from _ import _

def part1():
    # with open('7\\files\\toFind.txt', 'r') as file:        
    with open('7\\files\\given.txt', 'r') as file:
        info  = file.readlines()
        hands = []
        total = 0
        for x in range(len(info)):
            hands.append(0)
        
        for card in hands:
            total += card.get_winnings()
        

class Poker():
    cards = ""
    bet   = 0
    rank  = 0

    def __init__(self, cards, bet):
        self.cards = cards
        self.bet   = bet
    
    def get_winnings(self):
        return self.bet * self.rank