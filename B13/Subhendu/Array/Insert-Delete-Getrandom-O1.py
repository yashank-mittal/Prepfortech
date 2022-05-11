from random import choice

class RandomizedSet:

    def __init__(self):
        self.arr = []
        self.index_ptr = {}

    def insert(self, val: int) -> bool:
        if val in self.index_ptr:
            return False
        self.index_ptr[val] = len(self.arr)
        self.arr.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val in self.index_ptr:
            position = self.index_ptr.pop(val)
            last_item = self.arr[-1]
            if position != len(self.arr):
                self.arr[position] = last_item
                self.index_ptr[last_item] = position
            return True
        return False

    def getRandom(self) -> int:
        return choice(self.arr)


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()