from controller import Robot

TIME_STEP = 32
max_speed = 4

robot = Robot()


wheels = []
wheelsNames =['wheel1', 'wheel2','wheel3','wheel4']

for i in range (4):
    wheels.append(robot.getDevice(wheelsNames[i]))
    wheels[i].setPosition(float('inf'))
    wheels[i].setVelocity(0.0)
avoidObstacleCounter = 0


left_ir  = robot.getDevice('left_ir')
left_ir.enable(TIME_STEP)

middle_ir  = robot.getDevice('MID_ir')
middle_ir.enable(TIME_STEP)

right_ir  = robot.getDevice('right_ir')
right_ir.enable(TIME_STEP)




while robot.step(TIME_STEP) != -1:
    
    left_ir_value = left_ir.getValue()
    middle_ir_value = middle_ir.getValue()
    right_ir_value = right_ir.getValue()
    
    #print("left: {} middle: {} right: {}".format(left_ir_value, middle_ir_value, right_ir_value))
    
    
    leftSpeed = max_speed*0.4
    rightSpeed = max_speed*0.4
    
    
    if(358< left_ir_value<381) or ((358< middle_ir_value<381) and (358< left_ir_value<381) ) :
        rightSpeed = -max_speed
    elif(358< right_ir_value<381) or ((358< middle_ir_value<381) and (358< right_ir_value<381) ) :
        leftSpeed = -max_speed
        
        
        
        
    wheels[0].setVelocity(leftSpeed);
    wheels[1].setVelocity(rightSpeed);
    wheels[2].setVelocity(leftSpeed);
    wheels[3].setVelocity(rightSpeed);
 
