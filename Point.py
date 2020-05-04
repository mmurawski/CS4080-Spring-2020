
class Point:
    def __init__(self,x_init,y_init):
        self.x = x_init
        self.y = y_init

    def set_location(self, x, y):
        self.x = x
        self.y = y

    def get_location(self):
        return Point(self.x,self.y)

    def shift(self, x, y):
        self.x += x
        self.y += y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def __repr__(self):
        return "".join(["Point(", str(self.x), ",", str(self.y), ")"])


point1 = Point(5, 10)

print(point1)
print("Shift by (2,3)")

point1.shift(2, 3)
print(point1.get_location())
