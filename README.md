# CMSC 230: databases, in class

The project for the class pages on databases. It holds `FirstTable`, which
makes a table of accounts in a database and prints it, and room in `src` and
`test` for the rest. The database is H2, which `pom.xml` fetches: it runs
inside your own program and keeps its data in `bank.mv.db`, a file that
appears beside this README the first time a program uses it. Delete that file
to start over from nothing; `.gitignore` keeps it out of your commits.

Make a copy of your own first: click **Use this template**, then **Create a
new repository**. In the form, the Owner is **cu-cs-labs**, the Repository
name is `cmsc-230-jdbc-` followed by your GitHub username, and it is
**Private**: in the org rather than under your own account, so that the
instructor can see how far you got. Open your copy in IntelliJ with File,
New, Project from Version Control, and its address.
IntelliJ reads `pom.xml` and fetches H2 and JUnit by itself. Run a program from
the arrow beside its `main`, and a test from the arrow beside its name. Commit
and push before you leave, so the work follows you to the next computer.
