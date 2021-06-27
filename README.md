# Simple-Imperative-Language-Grammar-JavaCC
This projecte is an introduced to implement a simple grammar for the following imperative language using a tool named JavaCC

<b>
Digit → 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9<br>
Letter → a | b | c | d | e | f<br>
Num → Digit Num | ε<br>
Var → Letter Var | ε<br>
AExp → Num | Var | (AExp + AExp) | (AExp −AExp)<br>
BExp → tt | ff | (AExp == AExp) | ! BExp | (BExp ^ BExp)<br> 
Com → skip | Var := AExp | Com; Com | if BExp then Com else Com | while BExp do Com<br>
</b><br>

This projecte validates any given expression and determine if it belongs to this language or not.
