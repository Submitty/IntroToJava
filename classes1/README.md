## Classes and Objects - Part 1

In this homework your task is to create simulation of a person walking around Disney World.
As the person walks around the park your code should print out any place attraction that they
run into along the way.

## Representing the Data

You should use classes when storing the data. The exact implementaion is up to you however,
you need to have classes with the following

```java

public class Attraction{
	// Include a constructor and toString
}

public class FileParser{
	// Include a constructor and parse method to initiate the parsing
}

public class Park{
	// Include a constructor and toString to print out the map
}

public class Main{
	public static void main(String [] args){
		// Your code starts running from here
	}
}


```

You may find it helpful to create more classes and methods but the code above in required.

## Attractions
The data consists of a name and type for example 
Type: RIDE, Name: Big Thunder Mountain, 
Type: FOOD, Name: Cheshire Cafe

The 3 possible types are RIDE, FOOD, SHOW

## Parsing the Data

Each line of the text file consists is well-formatted
Type, name, x-cordinate, y-cordinate
the coordinate grid ranges from 1 to 10 (inclusive) with 1, 1 being the upper left and 10, 10 as the lower right

## Moving around the park

Your simulator will wander around the park for 10000 each set can add or subtract 1 from the current x or y coordinate
It is important that you call the random number generator in the same way, at each iteration of the loop call
```java
r.nextInt(4);
```
0 = West
1 = East
2 = North
3 = South

## Output

In order for the output to match on submitty we need to set the seed of the random number generater
The seed it set to 36820622

```java
Random r  = new Random(36820622);
```