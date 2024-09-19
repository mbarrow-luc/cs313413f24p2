TestIterator questions on line number...

25. no difference; both implement List
78. compile error; List doesn't support concurrent modification (Iterator can)



TestList questions on line number...

20. no difference; both implement List
93. removes element at index 5
99. removes lowest index element with value '5'



TestPerformance results

at SIZE = 10^4 and REPS = 10^7...
testArrayListAccess and testLinkedListAddRemove both < 1s
testArrayListAddRemove ~ 16s
testLinkedListAccess ~ 36s

at SIZE = 10^4 and REPS = 10^6...
testArrayListAccess and testLinkedListAddRemove both < 1s
testArrayListAddRemove ~ 2s
testLinkedListAccess ~ 3s

at SIZE = 10^3 and REPS = 10^7...
same as previous

at SIZE <= 10^3 and REPS <= 10^6...
all tests < 1s