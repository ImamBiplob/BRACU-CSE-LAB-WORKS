.MODEL SMALL
 
.STACK 100H

.DATA 



a db "THE SUM OF $"
b db " AND $"
c db " IS $"  


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov dl, 63
mov ah, 2
int 21h

mov ah,1
int 21h

mov bl,al

mov ah,1
int 21h

mov bh,al

lea dx,a
mov ah,9
int 21h

mov dl,bl
mov ah,2
int 21h

lea dx,b
mov ah,9
int 21h

mov dl,bh
mov ah,2
int 21h

lea dx,c
mov ah,9
int 21h

add bh,bl

sub bh,48

mov dl,bh
mov ah,2
int 21h 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN