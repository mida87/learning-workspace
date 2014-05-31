#!/usr/bin/env ruby

class MegaGreeter
	attr_accessor :names

	# Create the object
	def initialize(names = "World")
		@names = names
	end

	# say hi to everybody
	def say_hi
		if @names.nil?
			puts "..."
		elsif @names.respond_to?("each")
			@names.each do |name|
				puts "Hello #{name}!"
			end
		else
			puts "Hello #{@names}!"
		end
	end

	# Say bye to everybody
	def say_bye
		if @names.nil?
			puts "..."
		elsif @names.respond_to?("join")
      		# Join the list elements with commas
      		puts "Goodbye #{@names.join(", ")}.  Come back soon!"
  		else
  			puts "Goodbye #{@names}.  Come back soon!"
  		end
	end
end

if __FILE__ == $0
	mg = MegaGreeter.new
	mg.say_hi()
	mg.say_bye()

	mg.names = "Martin"
	mg.say_hi()
	mg.say_bye()

	mg.names = ["Martin", "Henric", "Alex"]
	mg.say_hi()
	mg.say_bye()

	mg.names = nil
	mg.say_hi()
	mg.say_bye()
end