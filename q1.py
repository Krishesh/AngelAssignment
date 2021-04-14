class Person:
    firstlen = 0
    middlelen = 0
    lastlen = 0

    def __init__(self, first_name, middle_name, last_name):
        self.first_name = first_name
        self.middle_name = middle_name
        self.last_name = last_name

    def first_name_length(self):
        for _ in self.first_name:
            Person.firstlen += 1
        print("First Name Length :" + str(Person.firstlen))

    def middle_name_length(self):
        for _ in self.middle_name:
            Person.middlelen += 1
        print("Middle Name Length :" + str(Person.middlelen))

    def last_name_length(self):
        for _ in self.last_name:
            Person.lastlen += 1
        print("Last Name Length :" + str(Person.lastlen))


full_name = Person('Krishesh', 'Padma', 'Shrestha')
full_name.first_name_length()
full_name.middle_name_length()
full_name.last_name_length()
