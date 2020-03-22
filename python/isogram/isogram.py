def is_isogram(string):
    char_set = set()
    string = string.lower()
    is_isgrm = True
    
    for letter in string:
        if letter == ' ' or letter == '-':
            continue

        if letter in char_set:
            is_isgrm = False
        else:
            char_set.add(letter)
    return is_isgrm

