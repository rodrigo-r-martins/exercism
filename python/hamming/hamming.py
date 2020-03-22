def distance(strand_a, strand_b):
    if len(strand_a) != len(strand_b):
        raise ValueError('Lenght should be the same')
    
    distance_count = 0
    for i in range(len(strand_a)):
        if strand_a[i] != strand_b[i]:
            distance_count += 1
    return distance_count
