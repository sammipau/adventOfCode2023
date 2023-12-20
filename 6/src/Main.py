import re

class BoatRace():
    time     = 0
    distance = 0
    numWins  = 0
    
    def __init__(self, time, distance):
        self.time     = time
        self.distance = distance

    def calculate_wins(self):
        for x in range(self.time):
            dist = (self.time - x) * x
            if (dist > self.distance):
                self.numWins += 1
        # print(f'wins: {self.numWins}')

def part1():
    # with open('6\\files\\toFind.txt', 'r') as file:        
    with open('6\\files\\given.txt', 'r') as file:
        info  = file.readlines()
        times = re.findall(r'\d+', info[0])
        dists = re.findall(r'\d+', info[1])
        total = 1

        for x in range(len(times)):
            race = BoatRace(int(times[x]), int(dists[x]))
            race.calculate_wins()
            total *= race.numWins

        print(f'total: {total}')
    
def part2():
    with open('6\\files\\toFind.txt', 'r') as file:        
    # with open('6\\files\\given.txt', 'r') as file:
        info  = file.readlines()
        total = 1

        alltimes = re.findall(r'\d+', info[0])
        alldists = re.findall(r'\d+', info[1])
        times    = ''.join(alltimes)
        dists    = ''.join(alldists)

        race = BoatRace(int(times), int(dists))
        race.calculate_wins()
        total *= race.numWins

        print(f'total: {total}')

part1()
part2()


