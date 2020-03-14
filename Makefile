classes/*: src/tries/*
	javac -d classes src/tries/*.java
example: classes/*
	java -classpath classes examples/App.java
.PHONY: example
clean:
	rm -rf classes
.PHONY: clean
