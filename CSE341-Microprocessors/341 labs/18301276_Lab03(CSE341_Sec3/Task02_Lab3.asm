.MODEL SMALL
 
.STACK 100H

.DATA
 
s1 db "Please insert two numbers for addition$:"
s2 db "Please insert two numbers for subtraction$:"
s3 db "Please insert two numbers for multiplication$:" 

s4 db "Your result is: $"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

;addition part starts here
LEA dx,s1
mov ah,9
int 21h

mov ah,1
int 21h  

mov bl,al

mov ah,1
int 21h

add bl,al

LEA dx,s4
mov ah,9
int 21h

mov dl,bl
mov ah,2
int 21h
;addition part ends here

;subtraction part starts here
LEA dx,s2
mov ah,9
int 21h

mov ah,1
int 21h

mov bl,al

mov ah,1
int 21h

sub bl,al

LEA dx,s4
mov ah,9
int 21h

mov dl,bl
mov ah,2
int 21h
;subtraction part ends here

;multiplication part starts here
LEA dx,s3
mov ah,9
int 21h

mov ah,1
int 21h

mov bl,al

mov ah,1
int 21h

mul bl

LEA dx,s4
mov ah,9
int 21h

mov dl,ah
mov ah,2
int 21h

mov dl,al
mov ah,2
int 21h  
;multiplication ends here


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
  