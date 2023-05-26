.MODEL SMALL
 
.STACK 100H

.DATA


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov CX,30h ;product is initialized to 0
mov AX,37h ;here one number is 37h or 7
mov BX,35h ;another number is 35h or 5

Start:
      cmp BX,30h
      je End
      add CX,AX 
      dec BX
      jmp Start
      
End:
   
    
       
;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN