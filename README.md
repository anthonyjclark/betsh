# betsh

Resources:

- https://ryanstutorials.net/bash-scripting-tutorial/
- https://unix.stackexchange.com/questions/65803/why-is-printf-better-than-echo
- https://stackoverflow.com/questions/669452/is-double-square-brackets-preferable-over-single-square-brackets-in-ba
- https://unix.stackexchange.com/questions/306111/what-is-the-difference-between-the-bash-operators-vs-vs-vs
- https://linuxgazette.net/18/bash.html

Notes:

- string slice (instead of array of characters)
- implement iterator
- strongly typed

Compiling:

```bash
javac -classpath /usr/local/Cellar/antlr/4.7.2/antlr-4.7.2-complete.jar *.java
```

# Special

```
$0 - The name of the Bash script.
$1 - $9 - The first 9 arguments to the Bash script. (As mentioned above.)
$# - How many arguments were passed to the Bash script.
$@ - All the arguments supplied to the Bash script.
$? - The exit status of the most recently run process.
$$ - The process ID of the current script.
$USER - The username of the user running the script.
$HOSTNAME - The hostname of the machine the script is running on.
$SECONDS - The number of seconds since the script was started.
$RANDOM - Returns a different random number each time is it referred to.
$LINENO - Returns the current line number in the Bash script.
```

# Commands

```
cd
ls
echo
mkdir
rm
basename
```

# Command substitution

```
myvar=$( ls /etc | wc -l )
```

# Strings
single quote has not substiution
double quote does

# Length of variable

```
${#variable}
```

# Tests

! EXPRESSION    The EXPRESSION is false.
-n STRING   The length of STRING is greater than zero.
-z STRING   The length of STRING is zero (ie it is empty).
STRING1 = STRING2   STRING1 is equal to STRING2
STRING1 != STRING2  STRING1 is not equal to STRING2
INTEGER1 -eq INTEGER2   INTEGER1 is numerically equal to INTEGER2
INTEGER1 -gt INTEGER2   INTEGER1 is numerically greater than INTEGER2
INTEGER1 -lt INTEGER2   INTEGER1 is numerically less than INTEGER2
-d FILE FILE exists and is a directory.
-e FILE FILE exists.
-r FILE FILE exists and the read permission is granted.
-s FILE FILE exists and it's size is greater than zero (ie. it is not empty).
-w FILE FILE exists and the write permission is granted.
-x FILE FILE exists and the execute permission is granted.

# Arrays

```bash
ARRAY=(one two three)
```

Arrays
    ()

Array access
    “${array[index]}”
Does this work with variables as index?
Can this be used inside arithmetic operations?

Array length
    “${#a[@]}”

# Arithmetic

$(( expression ))
    Need to handle temporaries differently? (see batch)
    ("10" ++ a[0]) * 2
x = ("10" ++ a[0]) * 2;
No quotes needed to use numeric variables inside

# Comments (#)

# Conditional (if-statement)
Single brackets or double?
If SOMETHING; then
    Do something
fi

Exists
    [ -e “thing” ]
    ex=$((!$?))

```bash
if [ <some test> ]
then
    <commands>
elif [ <some test> ] 
then
    <different commands>
else
    <other commands>
fi

if [ -r $1 ] && [ -s $1 ]
```

# Loops

```bash
while [ <some test> ]
do
    <commands>
done

counter=1
while [ $counter -le 10 ]
do
    echo $counter
    ((counter++))
done

for var in <list>
do
    <commands>
done

names='Stan Kyle Cartman'
for name in $names
do
    echo $name
done

for value in {1..5}
do
    echo $value
done

for value in {10..0..2}
for value in $1/*.html

break
continue
```

# Functions

```
function function_name {
    local var_name=<var_value>
    <commands>
    $1 # argument 1
}

$? is return value
```

# Printing

Print, Println
Printf
    Print array (see Batsh) (temporaries)

# Run command
$()
Can use assignment to get return value

# Other

Strings
    Nothing special “”

String Concatenation
    “String one””string two”

Variable access/use
    “$var”
