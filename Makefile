classes/*: src/tries/*
	javac -d classes src/tries/*.java
run:
	java -classpath classes src/App.java
.PHONY: run
clean:
	rm -rf classes
.PHONY: clean