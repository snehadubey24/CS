# Excercise 1.1

---

### 1. Give a real-world example that requires sorting or a real-world example that requires computing a convex hull.

`Answer` :

    The contact book in our phones needs to be sorted alphabetically so that we can find person phone number easily.
    Some other examples are flights, movie tickets they are all sorted by time.

    Convex hull can be defined as a step of points,
    a line connecting the points in a convex polygonic way,
    so that all the points are inside it.

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAQYAAACyCAMAAACXx5HZAAAAFVBMVEX///8AAAD/AAAA/wDAwMAAgACAgICzev3cAAAFLUlEQVR4nO2d4WLrIAiFk91t7//IdyGmbdJEEeRELOd3rfgVIUGr0xQKhUIONL/qbmOUEo9lPsrKQoDkY1k+/O8p1xzkY9k3TI1NbbWTYixvLZe2ttaaSTGWwJCaxqRIbSNETpEwzxtbWQiSbizz/PPz457BKsVYAoO2aXcKDKTAQAoMpMBACgykwEAKDKTAQMqP5SunATFkx5vH8HX3EBroK48h2/bZFGSsmXSe/dd2aVkG1rkW89NYRNpezxmu06+S5W3KJm5BNDfbIwkTi92BMDPXEwlTS73ES3sr60HgC92Yn6qKBGLZY//9OH/lgwAsgr2BRs5aHgnAkugy8O+n4EtMnHhpv0C+h5BANO2hrCIIBIbvo+4oEORJ2E+KTjAUJod5iMRPiuu8lwFhnjDBIbIwnmsS0KcGBIU89KxLmJY2YRCYU/CKhC2GtcL0+/trHxu5Afk8XlpiWLvrDMN06hJ2GLa+YBhq8tKRhBmGRzcgDLV5aQ/CCMNLFygM9XnphYQNhj1oEAZBXnrESwsMx2kHwyDpbQVhgOEQhjvHMJHBzTGc5KLeMTxXU1tZcfJo4gFD1aQoR6CzJ1VPGBhFwnI+unpcHwnDMvB8eeLi9c0FhnVtvVzDnUvFqsw7rAcM69o6A0O+dJkB+WcZrvimg67EkPcm61LDvi+V75Xr+deToqfVU2MMmRDZEQR7DFcJ0wqCsHxnjuHcMiMK1S/Nz4a6vMQbzuGh09IVhKV9TV5ig99jMKQgX+gR56UKD3zFYBcab1n2q/HAJwbLLHkHhioPfGAwzZKqSSHuswI9aMe2IkTKu5RgMDdKmDA1PQomBcIsIIRJGiIhhiFf0aUJE2AXFAPfA7F/cYJj4PYZGEiBgRQYSLTK1X951bzPhYOT8qpln9B6W2AgBQZSvxigHAIDKTCQAsMq6Orno8sFQ3GUYA5gCn1iuEHkgeVBjo6BudFhfA6LAgMpMJACw6rgQAoMpMBACgyrggMpMJACA3cVb3AO3DXdsTEsA2cdZTA0hpl9sMXgGPL/FXjRyBwQGOBbeerFnxRSDPiNXRKxQ6QQQ80mqzvF/7UkHOYOzoFiir0JSoQBvwVYLtaGlsBA8jIp5AGZt71JyAEbIjWZyQ4DOmGqsBtiwD4+6SYhc8+f4kESdtaLJiQHhtR6GAwxKdaezEOknMNdByCZJEwXGBo8PpnVp9Ebu4yPOQkMqxYOAqdzgmFKp70UP0e76etDkBcMy0/M+b8pUeBVq5qYJZS4P+Y59rPspGonGCrO8mdXshuYJZbwsDx2BhgWQ91FH8JJgd4JXYtBdNlJfYhE74SuwiC6+gZcTZKpAoPw/p/Dk0P9FyDExiA+n8TsNNqW4v6JTHE0x/o87R+D8jYsDxjKmUl9Wo8LDPnMpHSE7UscYMioCQTnGBoxmFxjaAfBMYbGh5i5vNG6pSNs3+gOQ3sIDjHYHOkHxaB+g7FwhPTNMAzq91k7CEAM0urGJttjoFGH/0hrXassHWHrYEZce6q5uNIcwtbH+d1hLSXHgDwU3ZyFcFIgHOG0T6uOJSHyDgivXVv0X50w778iwIZFDYQbHeEgCxbsnVm9QEhqnEg4GLpjsKkdizKGbiFsasGihKF3BpuULLIYuneEg+QsMhi8QUgSsbjE4JPBploW5xicOsJBFYnkDMMYEJJ4LN4xjMTgoRKL9zuEBoSQlGGxwzA0hKRzFi8YPoDBpjcWG4ZPcISDdiy2+zs/DULSAwVzR/fIUr2OhEKhxvoP4Kkqz4o6M4EAAAAASUVORK5CYII=)

    In image processing application Convex hull is used.

### 2. Other than speed, what other measures of efficiency might one use in a real-world setting?

`Answer` :

    i. Computer Memory
    ii. Network Usage

### 3. Select a data structure that you have seen previously, and discuss its strengths and limitations

`Answer` : Array Lists

    Advantages:
        1.  Access element in constant time.
        2.  Element can be inserted in any place.

    Disadvantages:
        1.  Random access takes n time.
        2.  Extra memory is utilized in making of index

### 4. How are the shortest-path and traveling-salesman problems given above similar? How are they different?

`Answer` :

    Similar :  Both are graph algorithms and find path.

    Difference : The shortest path algorithm needs 2 points, where as salesman algorithms
    needs a path between more points that returns to first point.

### 5. Come up with a real-world problem in which only the best solution will do. Then come up with one in which a solution that is “approximately” the best is good enough.

`Asnwer` :

    Sorting is a algorithm in real world in which only best solution will do.

    Finding the shortest path between two places as couple of meters wont matter a lot.
