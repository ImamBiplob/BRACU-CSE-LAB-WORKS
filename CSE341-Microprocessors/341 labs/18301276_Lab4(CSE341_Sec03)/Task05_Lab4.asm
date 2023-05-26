.MODEL SMALL
 
.STACK 100H

.DATA 



.CODE 
MAIN PROC 

;initialize DS
    
    MOV AX,@DATA 
    MOV DS,AX 
     
    ; enter your code here
    
    
    mov ah , 1
    int 21h
    
    cmp al ,5bh
    jl show
    jmp exit
    
    show:
    mov ah , 2
    mov dl , al
    int 21h
    
    exit:

 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
  

