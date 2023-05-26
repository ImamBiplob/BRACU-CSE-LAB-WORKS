.MODEL SMALL 

reverse macro s1,l  
    
    lea si,s1
    mov cx,l
    loop1:
    push [si] 
    inc si
    loop loop1
    
    mov cx,l
    loop2:
    pop dx
    mov ah,2
    int 21h
    loop loop2
   
endm    


.STACK 100H

.DATA
 
s dw "IMAM$"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

reverse s,4




;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN