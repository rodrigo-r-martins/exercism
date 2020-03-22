import re

def count_words(sentence):
    words_dict = {}
    words = re.findall(r"[a-zA-Z\d]+(?:\'t)?", sentence.lower())

    for word in words:
        if word in words_dict:
            words_dict[word] += 1
        else:
            words_dict[word] = 1
    return words_dict
