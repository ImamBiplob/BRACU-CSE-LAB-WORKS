.MODEL SMALL
 
.STACK 100H

.DATA  

a db 3 dup(?)  

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here
 
mov cx,3
mov si,0
mov dl,0 ; dl for storing the maximum number
mov ah,1 

start:

int 21h
mov a[si],al
cmp al,dl
jle next
       mov dl,al
next:
inc si

loop start

print:
mov ah,2
int 21h


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN