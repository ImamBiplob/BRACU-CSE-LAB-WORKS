.MODEL SMALL
 
.STACK 100H

.DATA


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov dl,80h
mov cl,39h

Start:
      mov bl,30h
      cmp dl,0ffh
      je End
      
                loop2:
                      cmp dl,0ffh
                      je end
                      cmp bl,cl
                      jg End2
                      mov ah,2
                      int 21h 
                      mov ch,dl 
                      mov dl,' '
                      mov ah,2
                      int 21h
                      mov dl,ch 
                      inc bl
                      inc dl
                      jmp loop2 
                End2: 

                      mov dh,dl
                      mov ah,2
                      mov dl,0ah
                      int 21h
                      mov dl,0dh
                      int 21h    
                      mov dl,dh
                      jmp Start       
                             
End:



                      
;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN