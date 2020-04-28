class Point {
    constructor(xCoord, yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    getX() { return this.xCoord; }
    getY() { return this.yCoord; }

    shift(x, y) {
        console.log("shift by (" + x + ", " + y + ")")
        this.xCoord = this.xCoord + x;
        this.yCoord = this.yCoord + y;
    }

    coords() {
        console.log("(" + this.xCoord + ", " + this.yCoord + ")");
    }
}

let pt = new Point(1,4);
pt.coords();
console.log("\n");
pt.shift(5,20);
pt.coords();

console.log("\nGetters: \n\tx = " + pt.getX() + "\ty = " + pt.getY())
