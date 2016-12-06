Feature: Position movements
  if I have a position
  and I decide to move it
  then it should be moved

Scenario: fresh to move
  Given we have fresh position
  When I move it
  Then it should be somewhere else