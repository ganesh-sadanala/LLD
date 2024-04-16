- There should be an number of meeting rooms.
- Each meeting room should have a specific capacity to accommodate the
desired number of people.
- If not reserved already, each meeting room should have the ability to be
booked, along with setting an interval, a start time, and an end time for the
meeting.
- A notification should be sent to all the people invited to the meeting.
- Users will receive an invite regardless of whether they are available at
the interval or not. Users can respond to the invitation by either accepting or
rejecting the invite.
- Each user should have access to a calendar that is used to track the date
and time, as well as to schedule or cancel meetings


#### Use cases

- Composite Pattern:
  - Use case: Representing a hierarchical structure of meetings, such as a series of related meetings or meetings with sub-meetings.
  - The Composite pattern composes objects (meetings) into tree structures to represent part-whole hierarchies.
- Template Method Pattern:
  - Use case: Defining a common structure for the scheduling process while allowing subclasses to override or specialize certain steps.
  - The Template Method pattern defines the skeleton of an algorithm (scheduling process) in a method, deferring some steps to subclasses.