""" Asked by: Google [Hard].

Implement an LFU (Least Frequently Used) cache.
It should be able to be initialized with a cache size n, and contain the following methods:

set(key, value): sets key to value. 
    If there are already n items in the cache and we are adding a new item, 
    then it should also remove the least frequently used item. 
    If there is a tie, then the least recently used key should be removed.
    
get(key): gets the value at key. If no such key exists, return null.

Each operation should run in O(1) time.

"""