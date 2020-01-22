# DesignPatternsExamples
Small examples of design patterns in Java so I can come back and review as needed.

# Stragety
This design pattern allows the behaviour of classes to be changed dynamically (at runtime) by creating a hierarchy of behaviour classes. The 2 abstract behaviour parent classes for this example are CompetitionType, what type of competition the horse competes in, and BadBehaviour. Each horse will have a CompetitionType and BadBehaviour attribute that can be changed during runtime. For example, if a horse competes in Races, they can retire from racing and begin competing in Barrel racing.

(Abstract) Horse child classes:
	Thoroughbred:	default CompetitionType = Race
					default BadBehaviour 	= Bolt
	QuarterHorse:	default CompetitionType	= Barrels
					default BadBehaviour	= Buck

(Abstract) CompetitionType child classes:
	Barrels
	Jumping
	Race

(Abstract) BadBehaviour child classes:
	Bolt
	Buck
	Refuse