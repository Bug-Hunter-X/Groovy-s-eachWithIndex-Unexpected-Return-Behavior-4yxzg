def list = [1, 2, 3, 4, 5]

def result = list.eachWithIndex { item, index ->
    if (index > 2) {
        return item * 2 // This will only return from the closure, not the eachWithIndex method
    }
}

println result // This will print null because eachWithIndex doesn't return anything useful if you don't use a collector.