module problem2_17301153(Clock, Resetn, w, q, c);
input Clock, Resetn; 
input [1:0]w;
output reg q;
output reg [1:0]c;
reg [1:0]y, Y;
parameter A = 2'b00, B = 2'b01, C=2'b11, D = 2'b10 ;
// Define the next state and output combinational circuits
always @(w, y)
	case (y)
		A: if (w[1]==0 && w[0]==0)
				begin
					q = 0;
					Y = A;
					c = 2'b11;
				end
			else if (w[1]==0 && w[0]==1)
				begin
					q = 0;
					Y = B;
					c = 2'b11;
				end
			else if (w[1]==1 && w[0]==0)
				begin
					q = 0;
					Y = D;
					c = 2'b11;
				end
			else
				begin
					q = 0;
					Y = A;
					c = 2'b11;
				end
		

		B: if (w[1]==0 && w[0]==0)
				begin
					q = 0;
					Y = B;
					c = 2'b11;
				end
		   else if (w[1]==0 && w[0]==1)
				begin
					q = 0;
					Y = C;
					c = 2'b11;
				end
		   else if (w[1]==1 && w[0]==0)
				begin
					q = 1;
					Y = A;
					c = 2'b11;
				end
		   else
				begin
					q = 0;
					Y = B;
					c = 2'b11;
				end
				
		
				
		C: if (w[1]==0 && w[0]==0)
				begin
					q = 0;
					Y = C;
					c = 2'b11;
				end
		   else if (w[1]==0 && w[0]==1)
				begin
					q = 0;
					Y = D;
					c = 2'b11;
				end
	       else if (w[1]==1 && w[0]==0)
				begin
					q = 1;
					Y = A;
					c = 2'b00;
				end
		   else
				begin
					q = 0;
					Y = C;
					c = 2'b11;
				end
		
				
		D: if (w[1]==0 && w[0]==0)
				begin
					q = 0;
					Y = D;
					c = 2'b11;
				end
		   else if (w[1]==0 && w[0]==1)
				begin
					q = 1;
					Y = A;
					c = 2'b11;
				end
				
		   else if (w[1]==1 && w[0]==0)
				begin
					q = 1;
					Y = A;
					c = 2'b01;
				end
		   else
				begin
					q = 0;
					Y = D;
					c = 2'b11;
				end
		
	endcase
	
// Define the sequential block
always @(negedge Resetn, posedge Clock)
	if (Resetn == 0) y <= A;
	else y <= Y;
endmodule