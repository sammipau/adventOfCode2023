# Day 2: Cube Conundrum

### Part 1
You find yourself launched high into the atmosphere! Your trajectory reaches the surface of a large island floating in the sky. Upon landing in a fluffy pile of leaves, you notice the cold air, yet strangely, there isn't much snow. An Elf quickly approaches to greet you.

The Elf explains that you've arrived at Snow Island and apologizes for the lack of snow. He offers to explain the situation but mentions it's a bit of a walk, giving you some time. With few visitors up here, the Elf suggests playing a game in the meantime.

As you walk, the Elf shows you a small bag filled with cubes in red, green, or blue. Each game involves the Elf hiding a secret number of cubes of each color in the bag, and your goal is to deduce information about the number of cubes.

To gather information, the Elf loads the bag with cubes, then reaches in, grabs a handful of random cubes, displays them, and returns them to the bag. This process repeats a few times per game.

You play several games, recording information from each game as your puzzle input. Each game is listed with an ID number (like "Game 11: ...") followed by a semicolon-separated list of revealed subsets of cubes from the bag (such as "3 red, 5 green, 4 blue").

For example, a few games might be recorded as follows:

```
Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
```

In Game 1, three sets of cubes are revealed from the bag. The first set is 3 blue cubes and 4 red cubes; the second set is 1 red cube, 2 green cubes, and 6 blue cubes; the third set contains only 2 green cubes.

The Elf's initial query revolves around determining which games would have been possible if the bag contained only 12 red cubes, 13 green cubes, and 14 blue cubes.

In the given example, games 1, 2, and 5 would have been possible with the specified cube configuration. However, game 3 would have been impossible as the Elf showed 20 red cubes at once. Similarly, game 4 would also have been impossible due to displaying 15 blue cubes at once. Summing the IDs of the possible games yields 8.

Your task is to ascertain which games would have been possible if the bag had been loaded with only 12 red cubes, 13 green cubes, and 14 blue cubes. What is the sum of the IDs of those games?

---

### Part two

The Elf says they've stopped producing snow because they aren't getting any water! He isn't sure why the water stopped; however, he can show you how to get to the water source to check it out for yourself. It's just up ahead!

As you continue your walk, the Elf poses a second question: in each game you played, what is the fewest number of cubes of each color that could have been in the bag to make the game possible?

Again consider the example games from earlier:

```
Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
```

In game 1, the game could have been played with as few as 4 red, 2 green, and 6 blue cubes. If any color had even one fewer cube, the game would have been impossible.
Game 2 could have been played with a minimum of 1 red, 3 green, and 4 blue cubes.
Game 3 must have been played with at least 20 red, 13 green, and 6 blue cubes.
Game 4 required at least 14 red, 3 green, and 15 blue cubes.
Game 5 needed no fewer than 6 red, 3 green, and 2 blue cubes in the bag.
The power of a set of cubes is equal to the numbers of red, green, and blue cubes multiplied together. The power of the minimum set of cubes in game 1 is 48. In games 2-5 it was 12, 1560, 630, and 36, respectively. Adding up these five powers produces the sum 2286.

For each game, find the minimum set of cubes that must have been present. What is the sum of the power of these sets?