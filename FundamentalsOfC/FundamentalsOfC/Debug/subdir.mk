################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../first.c 

OBJS += \
./first.o 

C_DEPS += \
./first.d 


# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C Compiler'
	gcc -I"D:\dev\tools\cygwin64\lib\gcc\x86_64-pc-cygwin\5.4.0\install-tools" -I"D:\dev\tools\cygwin64\lib\gcc\x86_64-pc-cygwin\5.4.0\include" -I"D:\dev\tools\cygwin64\usr\include" -I"D:\dev\tools\cygwin64\usr\include\w32api" -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


