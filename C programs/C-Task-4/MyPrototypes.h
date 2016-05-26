#pragma once
struct strDataNode* fnAddToListStart(struct strDataNode*, struct strPerson);
struct strDataNode* fnAddToListEnd(struct strDataNode*, struct strPerson);
bool fnContinue(bool);
struct strPerson fnEnterPersonDetails(struct strPerson);
struct strDataNode* fnEmpNameSearch(struct strDataNode*, struct strPerson);
struct strDataNode* fnEmpNoSearch(struct strDataNode*, struct strPerson);
struct strDataNode* fnExportFile(struct strDataNode*);
struct strDataNode* fnMenu(struct strDataNode*, bool , struct strPerson );
void fnPause(char);
struct strDataNode* fnPrintList(struct strDataNode*);
struct strDataNode* fnReadFile(struct strDataNode*);