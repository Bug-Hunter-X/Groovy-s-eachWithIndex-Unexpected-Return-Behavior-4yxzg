def list = [1, 2, 3, 4, 5]

def result = list.collectEntries { item, index ->
    if (index > 2) {
        [(index): item * 2] // Create a map for the collection entries
    } else {
        [(index): item] // If index is less than 2 we do not modify the entries
    }
}

println result //This will print a map with all the values correctly processed

//Alternative using collect
def result2 = list.collect { item, index ->
    if (index > 2) {
        item * 2 
    } else {
        item
    }
}

println result2