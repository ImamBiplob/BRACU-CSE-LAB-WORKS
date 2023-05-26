.MODEL SMALL
 
.STACK 100H

.DATA

n db 0

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov ah,1
int 21h

mov cl,al

mov ah,1 
mov si,0

mov dl,30h

input:
cmp dl,cl
je inputdone
      
      int 21h
      mov n[si],al
      inc si
      inc dl
      jmp input
      
inputdone: 
 
mov si,0
mov bl,30h

print:
cmp bl,cl
je printdone

        mov dl,n[si] 
        mov ah,2
        int 21h
        inc si
        inc bl
        jmp print 
        
printdone:      


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN