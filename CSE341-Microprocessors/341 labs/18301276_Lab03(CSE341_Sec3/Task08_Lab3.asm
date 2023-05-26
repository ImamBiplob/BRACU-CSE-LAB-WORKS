.MODEL SMALL
 
.STACK 100H

.DATA

a db "**********$"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h  

LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h
LEA dx,a
mov ah,9
int 21h

mov dl,0ah
mov ah,2
int 21h

mov dl,0dh
mov ah,2
int 21h

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN